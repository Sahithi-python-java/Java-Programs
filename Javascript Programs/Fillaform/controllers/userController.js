const db = require('../config/db'); // Import the database connection

// Controller function for registering a new user
exports.registerUser = (req, res) => {
  const { username, password, email, age, contact_number, first_name, last_name } = req.body;

  const query = `INSERT INTO users (username, password, email, age, contact_number, first_name, last_name)
                 VALUES (?, ?, ?, ?, ?, ?, ?)`;

  db.query(query, [username, password, email, age, contact_number, first_name, last_name], (err, result) => {
    if (err) {
      console.error('Error inserting data: ', err);
      res.status(500).send('Error inserting data');
    } else {
      console.log('Data inserted successfully');
      res.status(200).send('User registered successfully');
    }
  });
};

// Controller function to get the list of users
exports.getUsers = (req, res) => {
  const query = 'SELECT * FROM users';

  db.query(query, (err, results) => {
    if (err) {
      console.error('Error fetching data: ', err);
      res.status(500).send('Error fetching data');
    } else {
      res.status(200).json(results); // Return the list of users as a JSON response
    }
  });
};
