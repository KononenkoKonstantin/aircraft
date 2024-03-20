db.createUser({
    user: 'test-user',
    pwd: 'password',
    roles: [
        {
            role: 'readWrite',
            db: 'aircraftDb'
        }
    ]
});
