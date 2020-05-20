<template>
    <div>
        <div>{{ count }}</div>
        <div @click="increment" class="btn operator">클릭수 올리기</div>
        <div @click="reset" class="btn operator">초기화</div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            count: 0
        }
    },
    methods: {
        increment() {
            this.count++
        },
        reset() {
            this.count = '0'
        }
    }

}
</script>

<style scoped>
    .btn {
        background-color: #F2F2F2;
        border: 1px solid #999;
        width: 110px;
    }
    .operator {
        background-color: orange;
        color: white;
    }
</style>