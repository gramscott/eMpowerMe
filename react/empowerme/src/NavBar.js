import React from 'react';

const NavBar = (props) => {
  return (
    <header className="g-nav_wrapper"
    style={{color: 'blue', fontFamily: 'Arial, Times New Roman, Courier, and Helvetica'}}>
      <img src="/images/the_logo.jpg" alt="Logo" />
      <h1>eMpowerMe</h1>
      <ul>
        <li className="navLink">
          <a href="/categories">Categories</a>
        </li>

        <li className="navLink">
          <a href="/affirmations">Affirmations</a>
        </li>

        <li className="navLink">
          <a href="/diaries">Diaries</a>
        </li>
      </ul>
    </header> 
  )
}

export default NavBar;
