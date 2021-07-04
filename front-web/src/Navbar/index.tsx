import './style.css';
import {ReactComponent as Logo } from './school.svg';
import { Link } from 'react-router-dom';

function Navbar(){
    return(
        <nav className="main-navbar">
            <Logo />
            <Link to="/" href="home" className="logo-text">Home</Link>
        </nav>
    )
}
export default Navbar;