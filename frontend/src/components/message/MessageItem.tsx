import React from 'react'
import styles from './MessageItem.module.css'

import img from "../../assets/profile/m57.png";

import Avatar from "@mui/material/Avatar";
import Badge from "@mui/material/Badge";
import { styled } from "@mui/material/styles";

export default function MessageItem(message: any) {

  const StyledBadge = styled(Badge)(({ theme }) => ({
    "& .MuiBadge-badge": {
      backgroundColor: "#44b700",
      color: "#44b700",
      boxShadow: `0 0 0 2px ${theme.palette.background.paper}`,
      "&::after": {
        position: "absolute",
        top: 0,
        left: 0,
        width: "100%",
        height: "100%",
        borderRadius: "50%",
        animation: "ripple 1.2s infinite ease-in-out",
        border: "1px solid currentColor",
        content: '""',
      },
    },
    "@keyframes ripple": {
      "0%": {
        transform: "scale(.8)",
        opacity: 1,
      },
      "100%": {
        transform: "scale(2.4)",
        opacity: 0,
      },
    },
  }));

  return (
    <div className={styles.messageItemContainer}>
      <StyledBadge
        className={styles.messageItemProfile}
        overlap="circular"
        anchorOrigin={{ vertical: "bottom", horizontal: "right" }}
        variant="dot"
      >
        <Avatar alt="Remy Sharp" src={img} sx={{ width: 50, height: 50 }} />
      </StyledBadge>
      <div className={styles.messageItemBody}>
        <div className={styles.messageItemName}>
          <span className={styles.messageProfileName}>
            {message && message.message.userId}
          </span>
          <span className={styles.messageTime}>
            {message && message.message.chatTime}
          </span>
        </div>
        <div className={styles.messageItemText}>
          <span>{message && message.message.content}</span>
        </div>
      </div>
    </div>
  )
}