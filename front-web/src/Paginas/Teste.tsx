import { useEffect, useState } from 'react';
import { MontaPage } from './types';
import { fetchMontaPaginas2 } from '../api';
import { Button } from '@material-ui/core';



const search = window.location.search;
const params = new URLSearchParams(search);
const foox = params.get('codConteudo');
const foo2x = params.get('codNivel');
const nasCoxas = params.get('xx');



var codMateria: string;
var codNivel: string;
let proxPages: string[];
let qtdPaginas: number;

function teteia(u: number, t: string, v: string[]) {
    console.log('saindo da pagina medio', u + ' ' + t)
    console.log('qro ver ', v)
    //console.log('desespero ', paginas)
    var tt = '/montaPagina?codNivel=' + u + '&codConteudo=' + t + '&xx=' + v
    return tt
}

function separaString(text: string) {

    var arrayReturn: string[]
    return arrayReturn = text.split(',')

}

function goBack() {
    window.history.back()
}

function montaTexto(t: MontaPage) {

    let rows = []

    if (t != null) {
        var tasks = Object.values(t.blocos);
        var element: any
        for (let index = 0; index < tasks.length; index++) {
            element = tasks[index];
        }
        const myObjStr = JSON.stringify(tasks);
        console.log(myObjStr);
        console.log(element);


        qtdPaginas = t.proximasPaginas.length;
        proxPages = t.proximasPaginas;
        if (nasCoxas != null) {
            proxPages = separaString(nasCoxas);
            qtdPaginas = separaString(nasCoxas).length
        }

        console.log('gambiarra ', proxPages)

        console.log('proximas paginas: ', qtdPaginas)

        for (let i = 0; i < t.listaBlocoConteudo.length; i++) {
            rows.push(<p dangerouslySetInnerHTML={{ __html: t.listaBlocoConteudo[i] }} />)
            //rows.push(<p>{t.listaBlocoConteudo[i]}</p>)
        }
    }

    return rows;
}

function montaDesc(){

    var t = Number(codNivel);
    var info;
    if (t === 3) {
        info = 'Ensino Medio'
    }
    if (t === 2) {
        info = 'Ensino Fundamental II'
    }
    if (t === 1) {
        info = 'Ensino Fundamental I'
    }
    return codMateria.substring(0,3) +" - "+ info
}

function Teste() {

    if (foox != null) {
        codMateria = foox
    }
    if (foo2x != null) {
        codNivel = foo2x
    }

    const [montaTeste, setMontaTeste] = useState<any>();

    useEffect(() => {
        async function getItems() {
            try {
                const { data } = await fetchMontaPaginas2(codNivel, codMateria);
                setMontaTeste(data);
                console.log('veio2', montaTeste, codMateria)
            } catch (error) {
                alert("Ocorreu um erro ao buscar as informações");
            }
        }
        getItems();
    }, [])
    return (
        <>
            <header className="orders-steps-container">
                <div className="">
                    <h1 className="teste-alin">
                        {montaTeste?.titulo}
                    </h1>
                </div>
            </header>
            <div className="teste-alin">
                <Button id="button" variant="outlined" color="secondary" onClick={goBack}>{montaDesc()}</Button> 
            </div>
            <div className="order-location-container">
                <div className="order-location-content">
                    <div className="filter-container">
                        <div >
                            <div id="qtdPaginas" >
                                <ul>{montaTexto(montaTeste as MontaPage)}</ul>
                            <div  className="teste-alin">Paginas:
                               {proxPages && proxPages.map((modulo, index) => (

                                    <a href={teteia(Number(codNivel), modulo, proxPages)}> {index+1+" "} </a>
                                ))}
                            </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
           
        </>
    )
}
export default Teste;