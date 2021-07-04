import ProductsCard from "./ProductsCard";
import { Materia} from "./types";

type Props = {
    materias: Materia[];
}

function ProductList({ materias, }: Props) {
    return (
        <>
            <div className="orders-list-container" >
                <div className="orders-list-items">
                    {materias.map(materia => (
                        <ProductsCard key={materia.indice} materia={materia} />
                    ))}
                </div>
            </div>
        </>
    )
}
export default ProductList;