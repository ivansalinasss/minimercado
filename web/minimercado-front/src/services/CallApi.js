import Axios from "axios";

const httpClient = Axios.create({
  baseURL: process.env.REACT_APP_API_URL,
});

export default httpClient;


httpClient.interceptors.request.use((config) => {
  return config;
});

const responseSuccessHandler = (response) => response;

const responseErrorHandler = (error) => {
  return Promise.reject(error);
};

httpClient.interceptors.response.use(
  (response) => responseSuccessHandler(response),
  (error) => responseErrorHandler(error)
);

export function APIGet(endpoint, body, onSuccess, onError) {
  httpClient
    .get(endpoint, body)
    .then((response) => {
      onSuccess(response);
    })
    .catch((error) => {
      onError(error);
    });
}

export function APIPost(endpoint, body, onSuccess, onError) {
  httpClient
    .post(endpoint, body)
    .then((response) => {
      onSuccess(response);
    })
    .catch((error) => {
      onError(error);
    });
}
