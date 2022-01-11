import './style.css';
import { ReactComponent as MainImage } from './conecte_educacao_3_.svg';
import Footer from '../Footer';
import { Link } from 'react-router-dom';

/*function abrirEdInfantil() {
    console.log('abrindo link')
    window.open('https://hubs.mozilla.com/iN4vF4u/conecte-educacao', "_blank")
    return 'https://hubs.mozilla.com/iN4vF4u/conecte-educacao'
     
    
  }*/

function Home() {
    var homeEdInfantil = 'https://hubs.mozilla.com/iN4vF4u/conecte-educacao'
    
    return (
        <>
            <div className="home-container">
            <div className="home-image">
                        <MainImage />
                    </div>
            
                <div className="home-content">
                    <div className="home-actions2">
                        <Link to="/orders?codNivel=1" href="orders" className="home-btn-order">
                            FUNDAMENTAL I
                        </Link>
                    </div>
                    <div className="home-actions2">
                        <Link to="/orders?codNivel=2" href="orders" className="home-btn-order">
                            FUNDAMENTAL II
                        </Link>
                    </div>
                    <div className="home-actions2">
                        <Link to="/orders?codNivel=3" href="orders" className="home-btn-order">
                             MÉDIO
                        </Link>
                    </div>
                    <div className="home-actions2">
                        <a href={homeEdInfantil} target="_blank" rel="noreferrer noopener" className="home-btn-order">
                            ED. INFANTIL
                        </a>
                    </div>
                    
                </div>
            </div>
            
        </>
    )
}
export default Home;