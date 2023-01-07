import Keycloak from "keycloak-js";
const keycloak = new Keycloak({
  url: "https://auth.keksdose.xyz",
  realm: "laughing-train",
  clientId: "laughing-train-react",
});

export default keycloak;