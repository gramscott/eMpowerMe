import React, { Fragment } from 'react';
import { Link } from 'react-router-dom';

const Diary = (prop) => {

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
  
  if (!prop.diary) {
    return <p>Loading...</p>
  }

  const url = "/diaries/" + prop.diary.id

  return (
    <Fragment>
    <Link to={url} className='name'>
    <div style={myStyle}>
      <div className="component">
          <p className="name">
            {prop.diary.post}
          </p>
      </div>
    </div>
    </Link>
    </Fragment>
  )
}

export default Diary;