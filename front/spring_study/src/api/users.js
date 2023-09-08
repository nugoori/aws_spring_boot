import api from "./api"

// body로 안보내지는 data는 params로?

export const registerUser = async (user) => {
    return api.post('/user', user); // json으로 자동변환
}

export const getUserListAll = async () => {
    return api.get('/user/list');
}

export const updateUser = async (user) => {
    return api.put(`/users/${user.userId}`, user);
    // return api.put('/users/${user.userId}');
}

export const deleteUser = async (user) => {
    return api.delete(`/users/delete/${user.userId}`);
}
















