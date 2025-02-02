import React from "react";
import "./ProductCard.css";

const ProductCard = ({ product }) => {
  return (
    <div className="product-card">
      <img src={product.kuva} alt={product.nimi} className="product-image" />
      <h3>{product.nimi}</h3>
      <p>{product.kuvaus}</p>
      <p className="price">{product.hinta} €</p>
    </div>
  );
};

export default ProductCard;
