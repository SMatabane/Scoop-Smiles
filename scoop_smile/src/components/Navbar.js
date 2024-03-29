import React, { useState } from "react";

import { Link } from "react-router-dom";

import "../styles/Navbar.css";

function Navbar() {
  
  return (
    <div className="navbar">
      <div className="leftSide" >
        
        <div className="hiddenLinks">
          <Link to="/"> Home </Link>
          <Link to="/additems"> AddItems </Link>
          <Link to="/about"> About </Link>
          <Link to="/contact"> Contact </Link>
        </div>
      </div>
      <div className="rightSide">
        <Link to="/"> Home </Link>
        <Link to="/additems"> AddItems </Link>
        <Link to="/about"> About </Link>
        <Link to="/contact"> Contact </Link>
        
      </div>
    </div>
  );
}

export default Navbar;