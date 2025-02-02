import React from "react";
import { Link } from "react-router-dom";
import "./Header.css";

const Header = () => {
  return (
    <header className="header">
      <nav>
        <Link to="/" className="logo">
          Kahvikauppa
        </Link>
        <div className="nav-links">
          <Link to="/" className="nav-link">
            Koti
          </Link>
          <Link to="/products" className="nav-link">
            Tuotteet
          </Link>
        </div>
      </nav>
    </header>
  );
};

export default Header;
