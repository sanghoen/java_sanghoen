import React from 'react';

function Btn({text, event}){

  return(
    <button onClick={event}>{text}</button>
  )
}

export default Btn;