import React, { useState } from 'react';
import { makeStyles, Theme, createStyles } from '@material-ui/core/styles';
import Accordion from '@material-ui/core/Accordion';
import AccordionDetails from '@material-ui/core/AccordionDetails';
import AccordionSummary from '@material-ui/core/AccordionSummary';
import Typography from '@material-ui/core/Typography';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import { Arvore, ObjSubModuloDTO } from '../Orders/types';
import { useEffect } from 'react';
import { fetchArvore } from '../api';

import TreeView from '@material-ui/lab/TreeView';
import ChevronRightIcon from '@material-ui/icons/ChevronRight';
import TreeItem from '@material-ui/lab/TreeItem';
import { equal } from 'assert';
import { Button, ButtonGroup, Card, CardActionArea, CardActions, CardContent, CardMedia } from '@material-ui/core';
import ReactDOM from 'react-dom';
import { textChangeRangeIsUnchanged } from 'typescript';


var tetinha: string;
var codNivel: number;
var mat: string
var isArray: any[]
const search = window.location.search;
const params = new URLSearchParams(search);
const foox = params.get('codmateria');
const foo3x = params.get('materia');
const foo2x = params.get('codNivel');


if (foox != null) { mat = foox }
if (foo2x != null) { codNivel = Number(foo2x) }
if (foo3x != null) { tetinha = foo3x }


console.log('pagina medio', foox + ' ' + foo2x)


function teteia(u: number, t: string) {
  console.log('saindo da paginamedio', u + ' ' + t)
  var tt = '/montaPagina?codNivel=' + u + '&codConteudo=' + t
  return tt
}




function activateLasers(t: ObjSubModuloDTO[], u: string) {

  const numbers = [1, 2, 3, 4, 5];
  const listItems = numbers.map((number) =>

    <li>{number}</li>
  );

  //aqui
  const nomeSubModulos = t.map((nomeSub) =>
    <div className='order-card-container'>
      <h3 className="order-card-title">
        {nomeSub.submodulo}
      </h3>
      <div className="order-card-description">
        {nomeSub.subsubModulo && nomeSub.subsubModulo.map((subsub) =>
          <p>
            <a href={teteia(codNivel, subsub.codsubsubModulo)} >{subsub.subSubmodulo}</a>
          </p>
        )}
      </div>
    </div>
  );

  // ReactDOM.render(element, document.getElementById('ontologia'));
  ReactDOM.render(
    <div className="orders-container">
      <header className="orders-steps-container">
        <div className="">
          <div className="teste-alin">
            <h3>{u}</h3>
          </div>

        </div>
      </header>

      <div className="orders-list-container">
        <div className="orders-list-items">
          {nomeSubModulos},

        </div>
      </div>
    </div>
    ,
    document.getElementById('ontologia')
  );
}



var umTeste: Arvore[]
export function Medio() {

  const [arvores, setArvores] = useState<Arvore[]>();
  useEffect(() => {
    async function getItems() {
      try {
        const { data } = await fetchArvore(codNivel, mat);
        setArvores(data);
        if (data != null) {
          umTeste = data;
        }
        console.log('veio222222', data)
        console.log('chegou essa inf22222', mat)
        //.then(montaTexto(montaTeste as MontaPage))
      } catch (error) {
        alert("Ocorreu um erro ao buscar os items");
      }
    }
    getItems();
    //activateLasers( umTeste[0].objSubModulo,umTeste[0].modulo );
  },

    [])



  /*const [arvores, setArvores] = useState<Arvore[]>([]);
  console.log('arvoresssss',arvores)
  useEffect(() => {
    console.log('inicio componente monta arvores');
    
    //fetchArvore(2, 'MAT')
    fetchArvore(codNivel, mat)
    .then(response => setArvores(response.data))
    .catch(error => console.log(error));
    console.log('montaArvore: ', arvores)
    //buscaModulo(arvores);
  },
  [])
  const [active, setActive] = useState(arvores[0]);
  */
  return (
<>
    <div className="" >

      <div className="teste-alin">
        <h1>{tetinha}</h1>
      </div>
      <div className="teste-alin">


        <div className="alinhamento">
          {arvores && arvores.map(modulo => (
            
            <Button id="button" variant="outlined" color="secondary" onClick={() => { activateLasers(modulo.objSubModulo, modulo.modulo) }}>{modulo.modulo}</Button>
            ))}

        </div>


        <div className="orders-container" id="ontologia">

        </div>

      </div>
    </div>
            </>
  );
}

export default Medio;











