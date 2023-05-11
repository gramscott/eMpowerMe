import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Routes, useParams, Switch } from "react-router-dom";
import MainContainer from './containers/MainContainer'
import BackgroundSlideshow from './slideshow/slideshow';

const images = [
  require('./slideshow/images/slide1.jpg'),
  // require('./slideshow/images/background.jpg'),
  // require('./slideshow/images/forest2.jpg'),
  // require('./slideshow/images/forest4.jpg'),
  // require('./slideshow/images/forest5.jpg'),
  // require('./slideshow/images/forest6.jpg'),
  // require('./slideshow/images/forest7.jpg'),
  // require('./slideshow/images/nice_water.jpg'),
  // require('./slideshow/images/picture3.jpg'),
  // require('./slideshow/images/slide3.jpg'),
  // require('./slideshow/images/waterfall.jpg'),
]

function App(){
  return(
    <Router>
      <BackgroundSlideshow images={images} />
      <MainContainer/>
      
    </Router>
  )
}

export default App;