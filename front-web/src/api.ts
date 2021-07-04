import axios from "axios";

//const API_URL = 'http://localhost:8080';

const API_URL = 'https://conecte-educacao.herokuapp.com';

export function fetchProducts(){
    return axios(`${API_URL}/products`)
}

export function fetchMontaPaginas(){
    return axios(`${API_URL}/materias`)
}

/*
export function fetchMontaPaginas2(codMateria:string){
    return axios(`${API_URL}/conteudos/montaPagina/`+codMateria)
}

http://localhost:8080/conteudos/montaPagina?codNivel=2&codConteudo=MAT02020100
http://localhost:8080/conteudos/montaPagina?codNivel=3&codConteudo=FIS03010300

*/

export function fetchMontaPaginas2(codNivel:string,codMateria:string){
    return axios(`${API_URL}/conteudos/montaPagina?codNivel=`+codNivel+`&codConteudo=`+codMateria)
}

export function fetchMaterias(teste:number){
    
    return axios(`${API_URL}/materias/`+teste)
}


export function fetchArvore(codNivel:number,codModulo:string){
    console.log('tentou chamar a API')
    return axios(`${API_URL}/conteudos/montaArvore/?codNivel=`+codNivel+`&codModulo=`+codModulo)
}