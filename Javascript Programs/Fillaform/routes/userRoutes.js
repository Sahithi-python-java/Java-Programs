const express = require('express');
const router = express.Router();
const db = require('../config/db'); // Ensure this connects to your database

// POST route to handle user registration
router.post('/register', (req, res) => {
    const { username, password, email, age, contact_number, first_name, last_name } = req.body;

    // Example SQL query to insert user details into the database
    const query = `INSERT INTO users (username, password, email, age, contact_number, first_name, last_name)
                   VALUES (?, ?, ?, ?, ?, ?, ?)`;

    db.query(query, [username, password, email, age, contact_number, first_name, last_name], (err, result) => {
        if (err) {
            console.error(err);
            res.status(500).json({ message: 'Error saving user to database' });
        } else {
            res.status(201).json({ message: 'User registered successfully!' });
        }
    });
});

module.exports = router;
