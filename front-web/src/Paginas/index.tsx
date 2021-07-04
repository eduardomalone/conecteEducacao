
import Teste from "./Teste";



var codMateria: string;
var codNivel: string
const search = window.location.search;
const params = new URLSearchParams(search);
const fooy = params.get('codMateria');
const foo2y = params.get('codNivel');


function Paginas() {

    return (
        <div className="orders-container">
            <Teste />
        </div>
    )
}
export default Paginas;