export const increment = state =>{
    state.count++
    state.history.push('increment')
}
export const decrement = state =>{
    state.count--
    state.history.push('decrement')
}
export const login = state =>{
    state(alert('로그인 성공'))
}
export const join = state =>{
    state(alert('회원가입 성공'))
}
