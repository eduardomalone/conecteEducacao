import './style.css';
import { ReactComponent as MainImage } from './graduacao4.svg';
import Footer from '../Footer';
import { Link } from 'react-router-dom';

function Home() {
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
                    
                </div>
            </div>
            <Footer />
        </>
    )
}
export default Home;