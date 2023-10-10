import {BrowserRouter} from 'react-router-dom'
import Header from "./Header";
import Home from "./Home";
import Insert from "./Insert";

function App() {
  return (
    <BrowserRouter>
      <Header/>
      <Routes>
        <Route path="/"/>
        <Route path='/insert'/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
