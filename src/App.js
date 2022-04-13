import './App.css';
import React from 'react';
import {BrowserRouter, Switch, Route} from "react-router-dom";
//import { BrowserRouter as Router, Route, Switch, withRouter } from "react-router-dom";
//import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import Navbar from './components/Navbar/Navbar';
import User from './components/User/User';
import Home from './components/Home/Home';
import Reservation from './components/Reservation/Reservation';
import Tournaments from './components/Tournaments/Tournaments';
import Login from './components/Login/Login';
import Contact from './components/Contact/Contact';



function App() {
  return(
    <>
      <BrowserRouter>
        <div>
          <Navbar />
          <Switch>
            <Route exact path="/" component={Home} />
            <Route path="/reservations" component={Reservation} />
            <Route path="/tournaments" component={Tournaments} />
            <Route path="/courses" />
            <Route path="/my-profile" component={User} />
            <Route path="/contact" component={Contact} />
          </Switch>
        </div>
      </BrowserRouter>
    </>
  )
  }
  

export default App;
