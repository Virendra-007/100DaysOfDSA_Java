DELETE p
FROM Person p
JOIN (
    SELECT email, MIN(id) AS keep_id
    FROM Person
    GROUP BY email
) AS to_keep
ON p.email = to_keep.email
WHERE p.id != to_keep.keep_id;
