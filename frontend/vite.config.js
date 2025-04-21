import { defineConfig } from 'vite';
import react from '@vitejs/plugin-react';

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    port: 3000, // Specify a different port here, e.g., 3000 or another port of your choice
    host: '0.0.0.0', // Allows access from external devices on your network (optional)
    strictPort: true, // Ensures Vite will fail if the specified port is already in use
  },
});
