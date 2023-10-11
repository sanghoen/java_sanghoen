import {useState} from 'react';

//props는 빨간색과 맞춰야함 (app의 inputEvent)
function Input({inputEvent}){
	return (
		<input type="text" onChange={inputEvent}/>
	)
}
export default Input;
