import React, { Fragment } from 'react';
import { Link } from 'react-router-dom';

const Diary = (props) => {

  const myStyle = {
    fontFamily: 'Arial, sans-serif',
    backgroundColor: 'white',
    top: 0,
    left: 0,
    right: 0,
    border: '5px solid black',
    height: '80%',
    display: 'flex',
    alignItems: 'center'
  };
  
  if (!props.diary) {
    return <p>Loading...</p>
  }

  const url = "/diaries/" + props.diary.id

  return (
    <Fragment>
    <Link to={url} className='name'>
    <div style={myStyle}>
      <div className="component">
          <p className="name">
            {props.diary.entry}
          </p>
      </div>
    </div>
    </Link>
    </Fragment>
  )
}

export default Diary;
