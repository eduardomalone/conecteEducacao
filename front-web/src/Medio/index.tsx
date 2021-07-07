import React, { useState } from 'react';
import { Arvore, ObjSubModuloDTO } from '../Orders/types';
import { useEffect } from 'react';
import { fetchArvore } from '../api';

import { Button } from '@material-ui/core';
import ReactDOM from 'react-dom';
import { toast, ToastContainer } from 'react-toastify';
import Footer from '../Footer';
import { ImLibreoffice } from 'react-icons/im';


var tetinha: string;
var codNivel: number;
var mat: string
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

  //aqui
  Notify()
  const nomeSubModulos = t.map((nomeSub) =>
    <div className='order-card-container'>
      <h3 className="order-card-title">
        {nomeSub.submodulo}
      </h3>


      <div className="order-card-description">
        {nomeSub.subsubModulo && nomeSub.subsubModulo.map((subsub) =>
          <p>
            <div className="orders-flex">

              <div className="orders-icon">
                <ImLibreoffice />
              </div>
              <div >
                <a href={teteia(codNivel, subsub.codsubsubModulo)} >{subsub.subSubmodulo}</a>
              </div>
            </div>
          </p>
        )}
      </div>

    </div>
  );

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
        <div className="orders-list-items2">
          {nomeSubModulos},

        </div>
      </div>
    </div>
    ,
    document.getElementById('ontologia')
  );
}

function Notify() {
  //toast("Escolha um Card Abaixo"); 
  toast.info("Escolha um Card Abaixo!", {
    position: toast.POSITION.BOTTOM_CENTER
  });
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
        console.log('teste', umTeste)
        //.then(montaTexto(montaTeste as MontaPage))
      } catch (error) {
        alert("Ocorreu um erro ao buscar os items");
      }
    }
    getItems();
    //activateLasers( umTeste[0].objSubModulo,umTeste[0].modulo );
  },

    [])

  return (
    <>
      <ToastContainer
        autoClose={1000}
      />
      <div className="teste-alin">
        <h1>{tetinha}</h1>
      </div>
      <div className="teste-alin">

        <div className="alinhamento">
          {arvores && arvores.map(modulo => (
            <Button id="button" variant="outlined" color="primary" onClick={() => { activateLasers(modulo.objSubModulo, modulo.modulo) }}>{modulo.modulo}</Button>
          ))}
        </div>
        <div className="orders-container" id="ontologia">
        </div>
      </div>
    </>
  );
}

export default Medio;











