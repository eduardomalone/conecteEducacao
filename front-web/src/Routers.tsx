import React from "react";
import { BrowserRouter, Route, Switch } from "react-router-dom";
import Home from "./Home";
import Medio from "./Medio";
import Navbar from "./Navbar";
import Orders from "./Orders";
import Pagina from "./Paginas";

function Routers() {
    return (
        <BrowserRouter>
            <Navbar />
            <Switch>
                <Route path="/orders">
                    <Orders />
                </Route>
                <Route path="/montaPagina">
                    <Pagina />
                </Route>
                <Route path="/medio">
                    <Medio />
                </Route>
                <Route path="/">
                    <Home />
                </Route>
            </Switch>
        </BrowserRouter>
    )
}
export default Routers;