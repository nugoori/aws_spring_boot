import axios from "axios"

// 공통적인 옵션?을 작성할 때 사용 
const api = axios.create({
    baseURL: "http://localhost:8080"
});



export default api;