<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>결핵 정보</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 80%;
            max-width: 600px;
        }

        .title {
            font-size: 24px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .info {
            font-size: 16px;
            color: #333;
            margin-bottom: 20px;
        }

        .button {
            background-color: yellow;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        .button:hover {
            background-color:#FFD700;
        }

        .loading {
            color: #888;
            font-size: 18px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="title">질병 관련 정보</div>
    <div class="info" id="info">
        정보를 불러오는 중입니다...
    </div>
    <button class="button" id="loadButton">결핵 정보 불러오기</button>
</div>

<script>
    document.getElementById('loadButton').addEventListener('click',function() {
        fetchTBInfo();
    });
    function fetchTBInfo() {
        const apiUrl = 'wwxK9F1D7D6sMjogzUDu09KL9kCLUUQWQ8gvGudEoppChgZqsZI%2FDJ4RfuZfP9kq6tA2WEpBCXokwlUj7oqrhw%3D%3D';

        document.getElementById('info').innerHTML = '<div class="loading">정보를 불러오는 중...</div>';
        fetch(apiUrl)
            .then(response => response.json())
            .then(data => {
                console.log(data);

                if (data && data.info) {
                    document.getElementById('info').innerHTML = `<p><strong>결핵 정보:</strong> ${data.info}</p>`;
                } else {
                    document.getElementById('info').innerHTML = '<p>결핵 정보가 없습니다.</p>';
                }
            })
            .catch(error => {
                document.getElementById('info').innerHTML = '<p>정보를 불러오는 데 실패했습니다. 다시 시도해주세요.</p>';
                console.error('API 호출 오류:', error);
            });
    }
</script>

</body>
</html>
