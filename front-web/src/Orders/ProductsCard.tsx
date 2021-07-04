
import { Materia } from './types';

type Props = {
    materia: Materia;
}

function teteia(t: string, u:number, v:string) {
    console.log('click antes do monta pagina', t+' '+u)
    var tt = '/medio?codNivel='+u+'&codmateria='+t+'&materia='+v
    return tt
  }

function ProductsCard({ materia }: Props) {
    return (
            <div className="order-card-container">
                <h3 className="order-card-title">
                     <a href={teteia(materia.codmateria, materia.codnivel, materia.materia)}>{materia.materia}</a>
                </h3>
                <div className="order-card-description">
                   <h3 className="teste-alin">{materia.codmateria}</h3>
               </div>
            </div>
    )
}

export default ProductsCard;

