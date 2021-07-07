import './style.css';
import {ReactComponent as Logo } from './conecta_vai_essa.svg';
import { Link } from 'react-router-dom';

function Navbar(){
    return(
        <nav className="main-navbar">
            
            <Link to="/" className="logo-text"><Logo /></Link>
        </nav>
    )
}
export default Navbar;