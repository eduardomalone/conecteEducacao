
import { Materia, Product } from './types';
import { FiCornerDownRight } from 'react-icons/fi';
import React from 'react';


type Props = {
    materia: Materia;
}

function teteia(t: string, u: number, v: string) {
    console.log('click antes do monta pagina', t + ' ' + u)
    var tt = '/medio?codNivel=' + u + '&codmateria=' + t + '&materia=' + v
    return tt
}

function ProductsCard({ materia }: Props) {
    return (
        <>
            <div className="order-card-container">
                <h3 className="teste-alin">{materia.codmateria}</h3>
                <div className="order-card-description">
                    <div className="orders-flex">
                        <div className="orders-icon">
                            <FiCornerDownRight />
                        </div>
                        <div>
                            <h3 className="order-card-title">
                                <a href={teteia(materia.codmateria, materia.codnivel, materia.materia)}>{materia.materia}</a>
                            </h3>
                        </div>
                    </div>
                </div>
            </div>

        </>
    )
}

export default ProductsCard;

