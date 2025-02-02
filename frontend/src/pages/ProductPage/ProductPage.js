import React, { useState, useEffect } from "react";
import { useParams } from "react-router-dom";
import { getProductById } from "../../services/productService";
import "./ProductPage.css";

const ProductPage = () => {
  const [product, setProduct] = useState(null);
  const [loading, setLoading] = useState(true);
  const { id } = useParams();

  useEffect(() => {
    const fetchProduct = async () => {
      try {
        const data = await getProductById(id);
        setProduct(data);
        setLoading(false);
      } catch (error) {
        console.error("Error fetching product:", error);
        setLoading(false);
      }
    };

    fetchProduct();
  }, [id]);

  if (loading) return <div>Loading...</div>;
  if (!product) return <div>Product not found</div>;

  return (
    <div className="product-page">
      <div className="product-details">
        <div className="product-image">
          <img src={product.kuva} alt={product.nimi} />
        </div>
        <div className="product-info">
          <h1>{product.nimi}</h1>
          <p className="description">{product.kuvaus}</p>
          <p className="price">{product.hinta} €</p>
          <div className="additional-info">
            <p>
              <strong>Valmistaja:</strong> {product.valmistaja.nimi}
            </p>
            <p>
              <strong>Kategoria:</strong> {product.osasto.nimi}
            </p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default ProductPage;
