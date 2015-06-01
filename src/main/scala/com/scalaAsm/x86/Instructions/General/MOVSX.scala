package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move with Sign-Extension
// Category: general/conver

trait MOVSX extends InstructionDefinition {
  val mnemonic = "MOVSX"
}

object MOVSX extends TwoOperands[MOVSX] with MOVSXImpl

trait MOVSXLow extends MOVSX {
  implicit object _0 extends TwoOp[r16, rm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBE) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBE) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBE) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }

  implicit object _3 extends TwoOp[r32, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xBF) /r
    val format = RegRmFormat
  }

  implicit object _4 extends TwoOp[r64, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xBF) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}

trait MOVSXImpl extends MOVSXLow {
  implicit object _5 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xBF) /r
    val format = RegRmFormat
  }
}
