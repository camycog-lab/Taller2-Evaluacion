$url = "https://www.google.cl"
$requests = 5
$totalTime = 0

Write-Host "Iniciando prueba de carga a $url..." -ForegroundColor Cyan

for ($i=1; $i -le $requests; $i++) {
    $time = Measure-Command { Invoke-WebRequest -Uri $url }
    $ms = $time.TotalMilliseconds
    $totalTime += $ms
    Write-Host "Petición $i : Tardó $ms ms"
}

$avg = $totalTime / $requests
Write-Host "--------------------------"
Write-Host "Promedio de Latencia: $avg ms" -ForegroundColor Green
Write-Host "Prueba Finalizada."