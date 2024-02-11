
import './App.css';

import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from "./components/Navbar";
import Home from "./pages/Home";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import AddItems from "./items/AddItems";
import EditItems from "./items/EditItem";
import ViewItems from "./items/ViewItems";
import Footer from "./components/Footer";
function App() {
  return (
    <div className="App">
        <Router>
        <Navbar />

        <Routes>
          <Route exact path="/" element={<Home />} />
          <Route exact path="/additems" element={<AddItems />} />
          <Route exact path="/edititems/:id" element={<EditItems />} />
          <Route exact path="/viewitems/:id" element={<ViewItems />} />
        </Routes>
        <Footer />
      </Router>
    </div>
  );
}

export default App;
