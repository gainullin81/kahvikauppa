import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Header from "./components/Header/Header";
import Home from "./pages/Home/Home";
import Products from "./pages/Products/Products";
import ProductPage from "./pages/ProductPage/ProductPage";
import "./App.css";

function App() {
  return (
    <Router>
      <div className="App">
        <Header />
        <main>
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/products" element={<Products />} />
            <Route path="/product/:id" element={<ProductPage />} />
          </Routes>
        </main>
      </div>
    </Router>
  );
}

export default App;
