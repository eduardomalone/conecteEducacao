export type Product = {
    id: number,
    name: string,
    price: number,
    description: string,
    imageUri: string
}


export type Nivel = {
    id: number,
    nome: string,
    descricao: string,
    imageUri: string
}


export type Materia = {
    indice: number,
	codnivel: number,
	codmateria: string,
	materia: string
}

export type Arvore = {
    modulo: string,
	objSubModulo:[ObjSubModuloDTO],
}

export type ObjSubModuloDTO = {
    submodulo: string,
    subsubModulo:[ObjSubsubModuloDTO]
}

export type ObjSubsubModuloDTO = {
    subSubmodulo:string
    codsubsubModulo:string
}
	
	

