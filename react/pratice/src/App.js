import {BrowserRouter, Routes, Route} from 'react-router-dom'
import {useState} from 'react';
import React from 'react'
import {Link} from 'react-router-dom'
import {useLocation} from 'react-router-dom'
import {useNavigate} from 'react-router-dom'
import './index.css';



function App() {
  let [list, setList] = useState([{
    id : 1,
    title : 'Movie 1',
    genre: 'Drama',
    releaseDate : '2022-01-01'
  },{
    id : 2,
    title : 'Movie 2',
    genre: 'Action',
    releaseDate : '2022-02-01'
  },{
    id : 3,
    title : 'Movie 3',
    genre: 'Comedy',
    releaseDate : '2022-03-01'
		
  }
]);
  const deleteBoard = (id)=>{
    let tmpList = list.filter(item=>item.id != id);
    setList(tmpList);
  }
  const addBoard = (board)=>{
    setList([board, ...list]);
  }
  return (
    <BrowserRouter>
      <Header/>
      <Routes>
        <Route path="/" exact element={<Home list={list} deleteBoard={deleteBoard} add={addBoard}/>}/>
        <Route path='/insert' element={<Insert/>}/>
      </Routes>
    </BrowserRouter>
  );

	function Header(){
		return(
			<header className='menu'>
				<ul className='menu-list'>
					<li className='menu-item'>
						<Link to="/" className='menu-link'>List</Link>
					</li>
					<li className='menu-item'>
						<Link to="/insert" className='menu-link'>Add New Movie</Link>
					</li>
				</ul>
			</header>
		)
	}
	function Home({list, deleteBoard, add}){
		const location = useLocation();
		let board = location.state;
		if(board != null){
			add(board);
			location.state = null;
		}

		return (
			<main>
				<h1 className='movie1'>Movies</h1>
				<table>
					<thead>
					
						<tr>
							<th><p>ID</p></th>
							<th>Title</th>
							<th>Genre</th>
							<th>Release Date</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						{list.length == 0 ?
							<tr><th colSpan={4}><h1>등록된 영화가 없습니다.</h1></th></tr> :
							list.map(item=>{
								return(
								<tr key={item.id}>
									<td>{item.id}</td>
									<td>{item.title}</td>
									<td>{item.genre}</td>
									<td>{item.releaseDate}</td>
									<td><button onClick={()=>{deleteBoard(item.id)}}>삭제</button></td>
								</tr>
								)
							})
						}
					</tbody>
				</table>
			</main>
		)
	}
	function Insert({}){
		const navigate = useNavigate();
		const [id, setId] = useState('');
		const [title, setTitle] = useState('');
		const [genre, setGenre] = useState('');
		const [releaseDate, setreleaseDate] = useState('');

		const idChange = e => setId(e.target.value);
		const titleChange = e => setTitle(e.target.value);
		const genreChange = e => setGenre(e.target.value);
		const releaseDateChange = e => setreleaseDate(e.target.value);

		const idCheck = (id) => {
			return list.some(item => item.id == id);
		}
		
		const insertBoard = () => {
			if (id && idCheck(id)) {
				alert('중복된 아이디.');
				return;
			}
			if (id && title && genre && releaseDate) {
				navigate('/', {
					state: {
						id: id,
						title: title,
						genre: genre,
						releaseDate: releaseDate
					}
				});
			} else {
				alert('모든 값을 입력해야 함.');
			}
		}
		
		return(
			<table>
				<div>
					<h1 className='movie2'>Create Movie</h1>
					<input type="text" placeholder='Input movie id' onChange={idChange} value={id} required/>
					<br/>
					<input type="text" placeholder='Input movie title' onChange={titleChange} value={title} required/>
					<br/>
					<input type="text" placeholder='Input movie genre' onChange={genreChange} value={genre} required/>
					<br/>
					<label>출시일 :  
					<input type="date" name="schedule" onChange={releaseDateChange} value={releaseDate} required/>
					</label>
					<br/>
					<button type="button" onClick={insertBoard}>add Movie</button>
				</div>
			</table>
		)
	}
}


export default App;
