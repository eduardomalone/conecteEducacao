import './style.css';
import {ReactComponent as YoutubeIcon } from './youtube.svg';
import {ReactComponent as InstagranIcon } from './instagram.svg';
import {ReactComponent as LinkedinIcon } from './linkedin.svg';

function Footer(){
    return(
        <footer className="main-footer">
            App Conecte Educação
            <div className="footer-icons">
                <a href="www.youtube.com.br" target="_new">
                    <YoutubeIcon />
                </a>
                <a href="www.youtube.com.br" target="_new">
                    <InstagranIcon />
                </a>
                <a href="www.youtube.com.br" target="_new">
                    <LinkedinIcon />
                </a>

            </div>
        </footer>
    )
}
export default Footer;