import logo from '../../assets/img/logo.jpg';
import './style.css';

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="mts"/>
                <h1>mts</h1>
                <p>
                    Developed by 
                    <a href="https://github.com/mts-the-encoder"> matheus</a>
                </p>
            </div>
        </header>
    )
}

export default Header




