"use client";
import { useState } from "react";

import axios from "axios";
import styles from "../page.module.css";

function Form() {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);
  const [formData, setFormData] = useState({
    name: "",
    userId: "",
    username: "",
    userPassword: "",
    userAge: "",
    userWeight: "",
    userHeight: "",
    userLocalCountry: "",
    userRole: "",
  });

  // Handle form submission
  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post(
        "http://localhost:8080/api/1",
        formData,
        {
          headers: {
            "Content-Type": "application/json",
          },
        }
      );
      console.log("Success:", response.data);
      alert("User added successfully!");
    } catch (error) {
      console.error("Error:", error);
      alert("Error submitting form.");
    }
  };

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value,
    });
  };

  return (
    <div>
      <div style={{ padding: "20px", width: "20%" }}>
        <h2>User Registration</h2>
        <form
          onSubmit={handleSubmit}
          style={{ display: "flex", flexDirection: "column", gap: "10px" }}
        >
          <input
            type="text"
            name="name"
            placeholder="Name"
            onChange={handleChange}
            required
          />
          <input
            type="text"
            name="userId"
            placeholder="User ID"
            onChange={handleChange}
            required
          />
          <input
            type="text"
            name="username"
            placeholder="Username"
            onChange={handleChange}
            required
          />
          <input
            type="password"
            name="userPassword"
            placeholder="Password"
            onChange={handleChange}
            required
          />
          <input
            type="number"
            name="userAge"
            placeholder="Age"
            onChange={handleChange}
            required
          />
          <input
            type="number"
            name="userWeight"
            placeholder="Weight"
            onChange={handleChange}
            required
          />
          <input
            type="number"
            name="userHeight"
            placeholder="Height"
            onChange={handleChange}
            required
          />
          <input
            type="text"
            name="userLocalCountry"
            placeholder="Local Country"
            onChange={handleChange}
            required
          />
          <input
            type="text"
            name="userRole"
            placeholder="User Role"
            onChange={handleChange}
            required
          />
          <button type="submit">Submit</button>
        </form>
      </div>
    </div>
  );
}

export default Form;
