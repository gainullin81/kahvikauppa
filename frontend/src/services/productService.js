import axios from "axios";

const BASE_URL = "http://localhost:8080/api";

export const getProducts = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/tuote`);
    return response.data;
  } catch (error) {
    console.error("Error fetching products:", error);
    throw error;
  }
};

export const getProductById = async (id) => {
  try {
    const response = await axios.get(`${BASE_URL}/tuote/${id}`);
    return response.data;
  } catch (error) {
    console.error("Error fetching product:", error);
    throw error;
  }
};
