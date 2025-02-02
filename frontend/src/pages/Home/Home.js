import React from "react";
import { useNavigate } from "react-router-dom";
import "./Home.css";

const Home = () => {
  const navigate = useNavigate();

  return (
    <div className="home">
      <h1>Kahvikauppa</h1>
      <div className="button-container">
        <button
          className="category-button"
          onClick={() =>
            navigate("/products", { state: { category: "kahvilaitteet" } })
          }
        >
          Kahvilaitteet
        </button>
        <button
          className="category-button"
          onClick={() =>
            navigate("/products", { state: { category: "kulutustuotteet" } })
          }
        >
          Kulutustuotteet
        </button>
      </div>
    </div>
  );
};

export default Home;
