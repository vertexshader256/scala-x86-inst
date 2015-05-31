package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - parity/parity even (PF=1)
// Category: general/datamov

trait SETP extends InstructionDefinition {
  val mnemonic = "SETP"
}

object SETP extends OneOperand[SETP] with SETPImpl

trait SETPImpl extends SETP {
  implicit object SETP_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9A) /+ 0
    val format = RmFormat
    val hasRMByte = true
  }
}
