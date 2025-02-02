import React, { useState, useEffect } from "react";
import { useLocation } from "react-router-dom";
import { getProducts } from "../../services/productService";
import "./Products.css";

const Products = () => {
  const [products, setProducts] = useState([]);
  const [loading, setLoading] = useState(true);
  const location = useLocation();
  const category = location.state?.category;

  useEffect(() => {
    const fetchProducts = async () => {
      try {
        const data = await getProducts();
        const filteredProducts = category
          ? data.filter(
              (product) => product.osasto.nimi.toLowerCase() === category
            )
          : data;
        setProducts(filteredProducts);
        setLoading(false);
      } catch (error) {
        console.error("Error fetching products:", error);
        setLoading(false);
      }
    };

    fetchProducts();
  }, [category]);

  if (loading) return <div>Loading...</div>;

  return (
    <div className="products-container">
      <h2>
        {category
          ? category.charAt(0).toUpperCase() + category.slice(1)
          : "Kaikki tuotteet"}
      </h2>
      <div className="products-grid">
        {products.map((product) => (
          <div key={product.id} className="product-card">
            <img src={product.kuva} alt={product.nimi} />
            <h3>{product.nimi}</h3>
            <p>{product.kuvaus}</p>
            <p className="price">{product.hinta} €</p>
          </div>
        ))}
      </div>
    </div>
  );
};

export default Products;
