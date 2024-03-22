import { Outlet } from "react-router-dom";
import { Home } from "./Home";
import { isLoggedIn } from "../service/user-service";

export function Private() {

    var loggedIn = isLoggedIn();

    return (
        <div>
            {/* <h2>This is Private Component</h2> */}
            {
                loggedIn == true ? <Outlet /> : <Home />
            }
        </div>
    )
}