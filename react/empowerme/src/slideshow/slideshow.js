import React, { useState, useEffect } from "react";
// import "./slideshow.css";

const BackgroundSlideshow = ({ images, delay = 5000 }) => {
  const [currentImageIndex, setCurrentImageIndex] = useState(0);

  useEffect(() => {
    const interval = setInterval(() => {
      setCurrentImageIndex((prevIndex) =>
        prevIndex === images.length - 1 ? 0 : prevIndex + 1
      );
    }, delay);

    return () => clearInterval(interval);
  }, [images, delay]);

  const currentImage = images[currentImageIndex];

  const containerStyles = {
    backgroundImage: `url(${currentImage})`,
    backgroundSize: "cover",
    backgroundPosition: "center",
    opacity: 0.9,
    position: "fixed",
    top: 0,
    left: 0,
    right: 0,
    bottom: 0,
    zIndex: -1,
  };

  return <div style={containerStyles} className="background-slideshow"/>;
};

export default BackgroundSlideshow;
