<template>
    <div>
        <v-toolbar color="black" 
        prominent
        >
        <v-app-bar-nav-icon icon="mdi-weight-lifter" :ripple="false"></v-app-bar-nav-icon>

        <v-toolbar-title>LogBook</v-toolbar-title>

        <v-spacer></v-spacer>
        <v-label>Olá,</v-label>
        <v-btn icon>
            <v-icon>mdi-account</v-icon>
        </v-btn>
        </v-toolbar>
    </div>
</template>

<script>
    export default{
        name: 'Navbar'
    }
</script>