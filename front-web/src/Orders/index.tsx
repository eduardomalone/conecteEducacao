
import { useEffect, useState } from 'react';
import { fetchMaterias } from '../api';
import ProductList from './ProductsList';
import './style.css';
import { Materia } from './types';

var codNivel: number;

function nomeNivel(t: number) {

    if (t === 3) {
        return 'Ensino Medio'
    }
    if (t === 2) {
        return 'Ensino Fundamental II'
    }
    if (t === 1) {
        return 'Ensino Fundamental I'
    }
}

function Orders() {

    const search = window.location.search;
    const params = new URLSearchParams(search);
    const foo2 = params.get('codNivel');

    console.log('pagina orders - nivel', foo2)
    if (foo2 != null) {
        codNivel = Number(foo2)
    }

    nomeNivel(codNivel)

    const [materias, setMaterias] = useState<Materia[]>([]);
    console.log(materias)
    useEffect(() => {
        fetchMaterias(codNivel)
            .then(response => setMaterias(response.data))
            .catch(error => console.log(error));
    }, [])

    return (
        <>
            <div>
                <header className="orders-steps-container">
                    <div className="">
                        <div className="teste-alin">
                            <h1>{nomeNivel(codNivel)}</h1>
                        </div>
                    </div>
                </header>
                <div className="orders-container">
                    <ProductList materias={materias} />
                </div>
            </div>
        </>
    )
}
export default Orders;