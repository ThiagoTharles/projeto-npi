<template>
    <v-app-bar>
        <template v-slot:prepend>
            <v-app-bar-nav-icon icon="mdi-weight-lifter" :ripple="false"></v-app-bar-nav-icon>
        </template>
        <v-app-bar-title>LogBook</v-app-bar-title>
    </v-app-bar>
    
</template>

<script>
    export default{
        name: 'Navbar'
    }
</script>